def balance(chars: List[Char]): Boolean = {
      def bal(chars: List[Char], par: List[Char]): List[Char]= {
        if(chars.isEmpty) par
        else if(chars.head == '(') bal(chars.tail, '(' :: par)  else if(chars.head == ')') (if(!par.isEmpty && par.head == '(') bal(chars.tail,par.tail) else bal(chars.tail,')' :: par)) else bal(chars.tail,par)
      }
    if(bal(chars,"".toList).isEmpty) true else false
  }
