from datetime import datetime

with open("../../ftp/salidaEjecucion.txt", "r", encoding="utf-8") as archivo:
    contenido = archivo.read()
    lineas = contenido.split("\n")
    if ("> Task :test FAILED" in lineas):
        with open("../../README.md", "a", encoding="utf-8") as readme:
            readme.write(f"## Resultado del test, Fecha: {datetime.now()}")
            readme.write(f"❌ Tests fallidos\n")
    else:
        with open("../../README.md", "a", encoding="utf-8") as readme:
            readme.write(f"## Resultado del test, Fecha: {datetime.now()}\n")
            readme.write(f"✅ Tests correctos\n")        
        

