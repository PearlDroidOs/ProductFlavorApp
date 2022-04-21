# ProductFlavorApp
This project is for learning about product flavor and view binding

**View Binding**

**STEP 1** : Add viewBinding = true at build.gralde(Module: Appp) and re-sync a project as below 
```
android {
    . . .

    buildFeatures {
        viewBinding true
    }
}
```
**STEP 2** : At MainActivity use view bining
```
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.txtFlavor.text = "test"
    }
}
```

<br>

**Product Flavor**

At build.gradle (Module: App) add code as below:

```
android {
    compileSdk 32
    def mApplicationId = "com.example.productflavorapp"

    buildTypes {
        debug {
            minifyEnabled false
            debuggable true
            applicationIdSuffix ".dev"
        }

        stage {
            initWith debug
            applicationIdSuffix ".stage"
        }

        release {
            minifyEnabled true
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

. . .

    flavorDimensions "api"
    productFlavors {
        sit {
            dimension 'api'
            applicationId mApplicationId + ".sit"
        }
        uat {
            dimension 'api'
            applicationId mApplicationId + ".uat"
        }
        prod {
            dimension 'api'
        }
    }
}

```

Result will be

<img width="300" alt="Screen Shot 2565-04-21 at 13 17 50" src="https://user-images.githubusercontent.com/62892558/164386798-c7357dab-ceb2-44a1-a49d-b10d7d2e7774.png">
