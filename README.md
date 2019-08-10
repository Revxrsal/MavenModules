# MavenModules
A Maven template repository that allows controlling a Bukkit plugin with multiple sub-modules.

The repository comes with 2 version-specific modules: **v1_12_R1** for **Minecraft 1.12.2**, and **v1_14_R1** for **Minecraft 1.14.2**. They should be renamed accordingly to how it is desired.

# Building
Cloning this repository will include a task named **Assemble JAR**, which will produce the required final file. Alternatively, you can run **mvn clean package** from the **parent** module.