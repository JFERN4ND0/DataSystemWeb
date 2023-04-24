"use strict";
function _createForOfIteratorHelper(e, t) {
  var r,
    n,
    o,
    a,
    l = ("undefined" != typeof Symbol && e[Symbol.iterator]) || e["@@iterator"];
  if (l)
    return (
      (n = !(r = !0)),
      {
        s: function () {
          l = l.call(e);
        },
        n: function () {
          var e = l.next();
          return (r = e.done), e;
        },
        e: function (e) {
          (n = !0), (o = e);
        },
        f: function () {
          try {
            r || null == l.return || l.return();
          } finally {
            if (n) throw o;
          }
        },
      }
    );
  if (
    Array.isArray(e) ||
    (l = _unsupportedIterableToArray(e)) ||
    (t && e && "number" == typeof e.length)
  )
    return (
      l && (e = l),
      (a = 0),
      {
        s: (t = function () {}),
        n: function () {
          return a >= e.length ? { done: !0 } : { done: !1, value: e[a++] };
        },
        e: function (e) {
          throw e;
        },
        f: t,
      }
    );
  throw new TypeError(
    "Invalid attempt to iterate non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method."
  );
}
function _unsupportedIterableToArray(e, t) {
  var r;
  if (e)
    return "string" == typeof e
      ? _arrayLikeToArray(e, t)
      : "Map" ===
          (r =
            "Object" === (r = Object.prototype.toString.call(e).slice(8, -1)) &&
            e.constructor
              ? e.constructor.name
              : r) || "Set" === r
      ? Array.from(e)
      : "Arguments" === r || /^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(r)
      ? _arrayLikeToArray(e, t)
      : void 0;
}
function _arrayLikeToArray(e, t) {
  (null == t || t > e.length) && (t = e.length);
  for (var r = 0, n = new Array(t); r < t; r++) n[r] = e[r];
  return n;
}
var toggleMenu = document.getElementById("toggle-menu"),
  sidebar = document.getElementById("sidebar"),
  validarDatos =
    (toggleMenu &&
      toggleMenu.addEventListener("click", function (e) {
        ("toggle-menu" != e.target.id &&
          "toggle-menu" != e.target.parentElement.id) ||
          (sidebar.classList.toggle("show"),
          toggleMenu.classList.toggle("show"));
      }),
    function (e) {
      var t,
        r = _createForOfIteratorHelper(e);
      try {
        for (r.s(); !(t = r.n()).done; )
          if ("" == t.value)
            return window.alert("Todos los campos deben estar llenos"), !1;
      } catch (e) {
        r.e(e);
      } finally {
        r.f();
      }
      return !0;
    });
