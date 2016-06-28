def pascal(c: Int, r: Int): Int = {
    if(r == 0) 1
    else (if(c-1 >= 0) pascal(c-1,r-1) else 0) + (if(c <= r-1) pascal(c,r-1) else 0)
  }
