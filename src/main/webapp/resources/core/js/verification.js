function checkPassword(theForm) {
    if (theForm.pass.value != theForm.pass2.value)
    {
        alert('Those passwords don\'t match!');
        return false;
    } else {
        return true;
    }
}