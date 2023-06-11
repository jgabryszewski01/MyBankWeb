package MBGroup.MyBankWeb.Services;

import com.google.firebase.database.*;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class UsersInfoService {
    public CompletableFuture<Boolean> validateUser(String email, String password){
        DatabaseReference usersRef = FirebaseDatabase.getInstance().getReference("UsersInfo");
        CompletableFuture<Boolean> isValidFuture = new CompletableFuture<>();
        usersRef.orderByChild("email").equalTo(email).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                boolean isValid = false;
                for (DataSnapshot userSnapshot :dataSnapshot.getChildren()){
                    String storedPassword = userSnapshot.child("password").getValue(String.class);
                    if (storedPassword != null && storedPassword.equals(password)){
                        isValid = true;
                        break;
                    }
                }
                isValidFuture.complete(isValid);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                isValidFuture.completeExceptionally(databaseError.toException());
            }
        });
        return isValidFuture;
    }
}
