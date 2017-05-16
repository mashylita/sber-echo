(function (C) {
    if (typeof XPathEvaluator != "undefined") {
        C = pega.tools.normalizeXpath(C);
        var B = new XPathEvaluator();
        var E = B.evaluate(C, this, null, XPathResult.ORDERED_NODE_ITERATOR_TYPE, null);
        var A = new Array();
        if (E != null) {
            var D = E.iterateNext();
            while (D) {
                A.push(D);
                D = E.iterateNext()
            }
        }
        A.item = function (G) {
            return this[G]
        };
        if (A.length == 0) {
            return null
        } else {
            return A
        }
    } else {
        if (document.evaluate) {
            var E = document.evaluate(C, this, null, XPathResult.ORDERED_NODE_ITERATOR_TYPE, null);
            var A = new Array();
            if (E != null) {
                var D = E.iterateNext();
                while (D) {
                    A.push(D);
                    D = E.iterateNext()
                }
            }
            A.item = function (G) {
                return this[G]
            };
            return A.length == 0 ? null : A
        } else {
            var F = new ActiveXObject("Microsoft.XMLDOM");
            F.loadXML(this.getXmlOrSerialize());
            F.setProperty("SelectionNamespaces", "xmlns:xsl='http://www.w3.org/1999/XSL/Transform'");
            F.setProperty("SelectionLanguage", "XPath");
            if (F.documentElement == null) {
                return null
            }
            return F.documentElement.selectNodes(C)
        }
    }
})