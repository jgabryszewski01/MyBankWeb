// Pobranie referencji do elementów
const loginButton = document.getElementById("loginButton");
const registerButton = document.getElementById("registerButton");
const loginModal = document.getElementById("loginModal");
const registerModal = document.getElementById("registerModal");
const overlay = document.querySelectorAll(".overlay");

// Funkcja otwierająca modal
function openModal(modal) {
  modal.style.display = "block";
}

// Funkcja zamykająca modal
function closeModal(modal) {
  modal.style.display = "none";
}

// Obsługa kliknięcia przycisku Logowanie
loginButton.addEventListener("click", function () {
  openModal(loginModal);
});

// Obsługa kliknięcia przycisku Załóż konto
registerButton.addEventListener("click", function () {
  openModal(registerModal);
});

// Obsługa kliknięcia na overlay (zamknięcie modala)
overlay.forEach(function (element) {
  element.addEventListener("click", function () {
    closeModal(loginModal);
    closeModal(registerModal);
  });
});

// Obsługa zdarzenia submit dla formularza logowania
document.querySelector("#loginModal form").addEventListener("submit", function (event) {
  event.preventDefault();
  // Kod obsługujący logowanie użytkownika
  // Możesz tutaj wykonać żądanie do serwera w celu uwierzytelnienia użytkownika
});

// Obsługa zdarzenia submit dla formularza rejestracji
document.querySelector("#registerModal form").addEventListener("submit", function (event) {
  event.preventDefault();
  // Kod obsługujący rejestrację użytkownika
  // Możesz tutaj wykonać żądanie do serwera w celu zapisania danych użytkownika do bazy danych
});
