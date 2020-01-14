javascript: (function() {

    const removeElements = (elms) => elms.forEach(el => el.remove());
    removeElements( document.querySelectorAll(".logomo"));

    while (document.getElementsByClassName("swal-overlay swal-overlay--show-modal")[0]) {
        document.getElementsByClassName("swal-overlay swal-overlay--show-modal")[0].remove();
    }

    Array.from(document.getElementsByClassName("sosmed"))
    .forEach(element => element.remove());

    var atop = document.getElementsByClassName("widget_text section");
    if (atop.length > 0) {
        atop[0].parentNode.removeChild(atop[0]);
    }

    var sbox = document.getElementsByClassName("cmt commentx");
    if (sbox.length > 0) {
        sbox[0].parentNode.removeChild(sbox[0]);
    }

    var topbanr = document.getElementsByClassName("widget_text section");
    topbanr[0].parentNode.removeChild(topbanr[0]);

    document.getElementById("footer").remove();

    btndwnld = document.getElementById("IDDLL");
    btndwnld.parentNode.removeChild(btndwnld);

})();
