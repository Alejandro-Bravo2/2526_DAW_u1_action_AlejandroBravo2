

with open("salidaEjecucion.txt", "r", encoding="utf-8") as archivo:
    contenido = archivo.read()
    lineas = contenido.split("\n")
    if ("> Task :test FAILED" in lineas):
        print("FALLIDO")
    else:
        print("CORRECTOS")
        