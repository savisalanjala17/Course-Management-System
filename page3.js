async function login(role) {
    let username, password, messageId;

    if (role === 'admin') {
        username = document.getElementById('admin-username').value;
        password = document.getElementById('admin-password').value;
        messageId = 'admin-message';
    } else {
        username = document.getElementById('student-username').value;
        password = document.getElementById('student-password').value;
        messageId = 'student-message';
    }

    if (!username || !password) {
        document.getElementById(messageId).textContent = "Please enter username and password";
        return;
    }

    try {
        const response = await fetch('http://localhost:8080/check', {
            method: 'POST',
            headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
            body: `username=${encodeURIComponent(username)}&password=${encodeURIComponent(password)}&role=${role}`
        });

        const result = await response.text();
        document.getElementById(messageId).textContent = result;

        if (result === "Login successful") {
            if (role === 'admin') {
                window.location.href = "page5.html";
            } else {
                window.location.href = "page4.html";
            }
        }

    } catch (error) {
        console.error('Error:', error);
        document.getElementById(messageId).textContent = "Server error, try again later";
    }
}