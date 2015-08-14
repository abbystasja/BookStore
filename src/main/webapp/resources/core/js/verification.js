function checkPassword(theForm) {
    if (theForm.password.value != theForm.password2.value)
    {
        alert('Those passwords don\'t match!');
        return false;
    } else {
        return true;
    }
}