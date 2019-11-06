

```python
from mpl_toolkits.mplot3d import Axes3D
import matplotlib.pyplot as plt
import numpy as np
import math
%matplotlib notebook
```


```python
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')

phi, theta = np.mgrid[0 : 2 * np.pi : 0.1, 0 : np.pi : 0.1]  # Equivale a hacer un doble for

# Para pasar de coordenadas esféricas (phi, theta) a coordenadas cartesianas (x, y, z):

x = np.cos(phi) * np.sin(theta)
y = np.sin(phi) * np.sin(theta)
z = np.cos(theta)

# Para graficar la esfera (estructura de alambre):

ax.plot_wireframe(x, y, z, color='yellow', rstride=2, cstride=2, linewidth=0.5, alpha=0.8)

# Para graficar un punto cualquiera en el espacio 3d, en este caso (2, -2, 1):

ax.scatter(2, -2, 1, color='red', s=10) # El valor de s modifica el grosor del punto

# Para hacer una etiqueta, en este caso sobre el punto (2, -2, 1):

ax.text(2, -2, 1, 'Punto', color='black')

# Para graficar una flecha, en este caso del origen al punto (2, -2, 1):

ax.quiver(0, 0, 0, 2, -2, 1, color='blue')

# Nombres de los ejes

ax.set_xlabel('Eje X')
ax.set_ylabel('Eje Y')
ax.set_zlabel('Eje Z')

plt.show()




Ciudades = [
    ['Londres', 51.5, -0.1167],
    ['Bogotá', 4.5964, -74.0833],
    ['Roma', 41.8960, 12.4833],
    ['Melbourne', -37.8200, 144.9750],
    ['Nairobi', -1.2833, 36.8167],
    ['Santiago', -33.4500, -70.6670],
    ['Nueva York', 40.6943, -73.9249],
    ['Los Angeles', 34.1139, -118.4068],
    ['Moscú', 55.7522, 37.6155],
    ['Quito', -0.2150, -78.5001],
    ['Tokio', 35.6850, 139.7514],
    ['Lagos', 6.4433, 3.3915],
    ['Atenas', 37.9833, 23.7333],
    ['Belén de Pará', -1.4500, -48.4800],
    ['Budapest', 47.5000, 19.0833],
    ['Vancouver', 49.2734, -123.1216],
    ['París', 48.8667, 2.3333],
    ['Puebla', 19.0500, -98.2000]
]
```


```python

```


```python
for i in range (len(Ciudades)):
    
    Ciudades[i][1] = abs(Ciudades[i][1] - 90)
    
    Ciudades[i][1] = (Ciudades[i][1] * math.pi) / 180
    Ciudades[i][2] = (Ciudades[i][2] * math.pi) / 180
        
        
```


```python
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')

phi, theta = np.mgrid[0 : 2 * np.pi : 0.1, 0 : np.pi : 0.1]  # Equivale a hacer un doble for

# Para pasar de coordenadas esféricas (phi, theta) a coordenadas cartesianas (x, y, z):

x = np.cos(phi) * np.sin(theta)
y = np.sin(phi) * np.sin(theta)
z = np.cos(theta)

# Para graficar la esfera (estructura de alambre):

ax.plot_wireframe(x, y, z, color='Blue', rstride=2, cstride=2, linewidth=0.5, alpha=0.8)

for i in range(len(Ciudades)):
    
    x1 = np.cos(Ciudades[i][2]) * np.sin(Ciudades[i][1])
    y1 = np.sin(Ciudades[i][2]) * np.sin(Ciudades[i][1])
    z1 = np.cos(Ciudades[i][1])

    ax.scatter(x1, y1, z1, color='red', s=10) # El valor de s modifica el grosor del punto

    ax.text(x1, y1, z1, Ciudades[i][0], color='black')
    
    ax.quiver(0, 0, 0, x1, y1, z1, color='red')


ax.set_xlabel('Eje X')
ax.set_ylabel('Eje Y')
ax.set_zlabel('Eje Z')

plt.show()
    
    
```




```python

```
