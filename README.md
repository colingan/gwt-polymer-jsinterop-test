# GWT JSInterop Test

Run compiled version:

* Open `src/main/webapp/index.html` in browser

* Recompile with `./gradlew clean compileGwt; rm -r src/main/webapp/SomeModule_compiled; cp -Rvp build/gwt/out/SomeModule src/main/webapp/SomeModule_compiled;`

Run SDM:

* Comment compiled and uncomment SDM launcher script in `src/main/webapp/index.html`

* Run `./gradlew client:gwtSuperDev` and start some webserver (e.g. in IDE) and serve `index.html` on localhost
