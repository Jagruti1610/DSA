function reverse(str, len) {
    if (len == str.length) {
        return;
    }
    reverse(str, len + 1);

    document.write(str[len]);

}
