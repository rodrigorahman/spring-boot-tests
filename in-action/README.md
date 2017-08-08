##Externalizando arquivos de configuração.

1. Criar uma subdiretório /config na raiz do jar ou war 
2. Externally, in the directory from which the application is run
3. Internally, in a package named “config”
4. Internally, at the root of the classpath

>Caso tenha um arquivo na pasta /config e um no classpath o do class path sobrescreverá o do /config***

>Caso tenha um arquivo .properties e um .yaml o yaml sobrescreverá o .properties***


