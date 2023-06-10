 ch 13 
   
# true / false
1) given that CurrentAccount is a sub-class of Account , List<CurrentAccount> is a sub-type of List<account>.
//False.
 In Java, generics are not covariant. Therefore, List<CurrentAccount> is not a subtype of List<Account>,
  even though CurrentAccount is a subclass of Account. This is known as invariant typing in generics.
  You cannot directly assign a List<CurrentAccount> to a variable of type List<Account>. 
  However, you can use wildcard types or bounded wildcards to achieve certain forms of covariance or contravariance.

2) Generics are implemented by Type Erasure.
//True. 
  Generics in Java are implemented using type erasure. This means that type parameters are removed (or erased) during compilation, and the generic type information is not available at runtime. 

# fill the blank





