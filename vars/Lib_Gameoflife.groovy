def Code_Checkout()
{
checkout scm
}

def Cleanup(String Dir)
{
sh 'rm -r Dir'
}

def Build()
{
sh 'mvn clean install'
}