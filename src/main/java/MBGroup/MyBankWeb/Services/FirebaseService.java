package MBGroup.MyBankWeb.Services;

import com.google.firebase.database.*;
import org.springframework.stereotype.Service;

@Service
public class FirebaseService {

    public void writeToDatabase(String path, Object value) {
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference(path);
        databaseReference.setValueAsync(value);
    }
}

