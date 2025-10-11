from datetime import datetime

with open("salidaEjecucion.txt", "rw", encoding="utf-8") as archivo:
    contenido = archivo.read()
    lineas = contenido.split("\n")
    if ("> Task :test FAILED" in lineas):
        archivo.write(f"Resultado del test, Fecha: ${datetime.now()}")
        archivo.write(f"❌ Tests fallidos")
    else:
        archivo.write(f"Resultado del test, Fecha: ${datetime.now()}")
        archivo.write(f"✅ Tests correctos")        