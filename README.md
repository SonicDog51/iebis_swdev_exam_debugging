# First bug

The program is displaying all "/" instead of the letters, this is because the program is replacing everything with forward slashes not only the "."
To fix that we need to change it to the regex "\\." and then it will understand what we need.


# Second Bug

It wouldn't display the F, Y or T. This is because the generator takes the argument as the size of the StringBuffer and this can be fixed by creating the StringBuffer in the following way:

```java
    word = new StringBuffer();
    word.append('Y');
```

# Third Bug

The code wont alternate between F, Y and T. it will only output Four.
To fix this: we have to make sure that after each case is valid, to break the switch function. this can be done by the following:

```java
    switch (number) {
                case 0:
                    word = new StringBuffer();
                    word.append('Y');
                    break;
                case 1:
                    word = new StringBuffer();
                    word.append('T');
                    break;
                case 2:
                    word = new StringBuffer();
                    word.append('F');
                    break;
                default:
                    System.out.println("this shouldn't appear");
            }
```

# Fourth bug

The last bug is that the range of the method *random.nextInt()* is incorrect and it should be one value higher. This is because the function is exclusive, so from 0 to the last value -1 will be all the possible values that it could return.
Therefore if it is changed to *random.nextInt(3)* the possible outcomes are 0, 1 and 2.
