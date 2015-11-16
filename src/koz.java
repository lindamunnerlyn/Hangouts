// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class koz extends koj
{

    private static volatile koz i[];
    public int a[];
    public String b;
    public String c;
    public kpe d;
    public kpm e;
    public String f;
    public kpi g;
    public String h;

    public koz()
    {
        a = kou.a;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static koz[] a()
    {
        if (i == null)
        {
            synchronized (kon.a)
            {
                if (i == null)
                {
                    i = new koz[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = 0;
        int l = super.computeSerializedSize();
        int k;
        if (a != null && a.length > 0)
        {
            k = 0;
            for (; j < a.length; j++)
            {
                k += koh.e(a[j]);
            }

            k = l + k + a.length * 1;
        } else
        {
            k = l;
        }
        j = k;
        if (b != null)
        {
            j = k + koh.b(2, b);
        }
        k = j;
        if (c != null)
        {
            k = j + koh.b(3, c);
        }
        j = k;
        if (d != null)
        {
            j = k + koh.d(4, d);
        }
        k = j;
        if (e != null)
        {
            k = j + koh.d(5, e);
        }
        j = k;
        if (f != null)
        {
            j = k + koh.b(6, f);
        }
        k = j;
        if (g != null)
        {
            k = j + koh.d(7, g);
        }
        j = k;
        if (h != null)
        {
            j = k + koh.b(8, h);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L26:
        int j = kog1.a();
        j;
        JVM INSTR lookupswitch 10: default 100
    //                   0: 110
    //                   8: 112
    //                   10: 2088
    //                   18: 5870
    //                   26: 5881
    //                   34: 5892
    //                   42: 5921
    //                   50: 5950
    //                   58: 5961
    //                   66: 5990;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kog1, j))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int ai[];
        int k;
        int j1;
        j1 = kou.b(kog1, 8);
        ai = new int[j1];
        k = 0;
        j = 0;
_L18:
        if (k >= j1) goto _L13; else goto _L12
_L12:
        int k1;
        if (k != 0)
        {
            kog1.a();
        }
        k1 = kog1.f();
        k1;
        JVM INSTR tableswitch 0 449: default 1972
    //                   0 1981
    //                   1 1981
    //                   2 1981
    //                   3 1981
    //                   4 1981
    //                   5 1981
    //                   6 1981
    //                   7 1981
    //                   8 1972
    //                   9 1972
    //                   10 1972
    //                   11 1981
    //                   12 1981
    //                   13 1981
    //                   14 1981
    //                   15 1981
    //                   16 1981
    //                   17 1981
    //                   18 1981
    //                   19 1981
    //                   20 1981
    //                   21 1981
    //                   22 1981
    //                   23 1981
    //                   24 1981
    //                   25 1981
    //                   26 1981
    //                   27 1981
    //                   28 1981
    //                   29 1981
    //                   30 1981
    //                   31 1981
    //                   32 1981
    //                   33 1981
    //                   34 1981
    //                   35 1981
    //                   36 1981
    //                   37 1981
    //                   38 1981
    //                   39 1981
    //                   40 1981
    //                   41 1981
    //                   42 1981
    //                   43 1981
    //                   44 1981
    //                   45 1981
    //                   46 1981
    //                   47 1981
    //                   48 1981
    //                   49 1981
    //                   50 1981
    //                   51 1981
    //                   52 1981
    //                   53 1981
    //                   54 1981
    //                   55 1981
    //                   56 1981
    //                   57 1981
    //                   58 1981
    //                   59 1981
    //                   60 1981
    //                   61 1981
    //                   62 1981
    //                   63 1981
    //                   64 1981
    //                   65 1981
    //                   66 1981
    //                   67 1981
    //                   68 1981
    //                   69 1981
    //                   70 1981
    //                   71 1981
    //                   72 1981
    //                   73 1981
    //                   74 1981
    //                   75 1981
    //                   76 1981
    //                   77 1981
    //                   78 1981
    //                   79 1981
    //                   80 1981
    //                   81 1981
    //                   82 1981
    //                   83 1981
    //                   84 1981
    //                   85 1981
    //                   86 1981
    //                   87 1981
    //                   88 1981
    //                   89 1981
    //                   90 1981
    //                   91 1981
    //                   92 1981
    //                   93 1981
    //                   94 1981
    //                   95 1981
    //                   96 1981
    //                   97 1981
    //                   98 1981
    //                   99 1981
    //                   100 1981
    //                   101 1981
    //                   102 1981
    //                   103 1981
    //                   104 1981
    //                   105 1981
    //                   106 1981
    //                   107 1981
    //                   108 1981
    //                   109 1981
    //                   110 1981
    //                   111 1981
    //                   112 1981
    //                   113 1981
    //                   114 1981
    //                   115 1981
    //                   116 1981
    //                   117 1981
    //                   118 1981
    //                   119 1981
    //                   120 1981
    //                   121 1981
    //                   122 1981
    //                   123 1981
    //                   124 1981
    //                   125 1981
    //                   126 1981
    //                   127 1981
    //                   128 1981
    //                   129 1981
    //                   130 1981
    //                   131 1981
    //                   132 1981
    //                   133 1981
    //                   134 1981
    //                   135 1981
    //                   136 1981
    //                   137 1981
    //                   138 1981
    //                   139 1981
    //                   140 1981
    //                   141 1981
    //                   142 1981
    //                   143 1972
    //                   144 1981
    //                   145 1981
    //                   146 1981
    //                   147 1981
    //                   148 1981
    //                   149 1981
    //                   150 1972
    //                   151 1981
    //                   152 1972
    //                   153 1972
    //                   154 1972
    //                   155 1972
    //                   156 1972
    //                   157 1981
    //                   158 1972
    //                   159 1972
    //                   160 1981
    //                   161 1981
    //                   162 1981
    //                   163 1981
    //                   164 1981
    //                   165 1981
    //                   166 1981
    //                   167 1981
    //                   168 1981
    //                   169 1972
    //                   170 1981
    //                   171 1981
    //                   172 1981
    //                   173 1981
    //                   174 1981
    //                   175 1981
    //                   176 1972
    //                   177 1981
    //                   178 1981
    //                   179 1981
    //                   180 1981
    //                   181 1981
    //                   182 1981
    //                   183 1981
    //                   184 1981
    //                   185 1981
    //                   186 1981
    //                   187 1981
    //                   188 1981
    //                   189 1981
    //                   190 1981
    //                   191 1981
    //                   192 1981
    //                   193 1981
    //                   194 1981
    //                   195 1981
    //                   196 1981
    //                   197 1981
    //                   198 1981
    //                   199 1981
    //                   200 1981
    //                   201 1981
    //                   202 1981
    //                   203 1981
    //                   204 1981
    //                   205 1981
    //                   206 1981
    //                   207 1981
    //                   208 1981
    //                   209 1981
    //                   210 1981
    //                   211 1981
    //                   212 1981
    //                   213 1981
    //                   214 1972
    //                   215 1981
    //                   216 1981
    //                   217 1981
    //                   218 1981
    //                   219 1981
    //                   220 1981
    //                   221 1972
    //                   222 1981
    //                   223 1981
    //                   224 1981
    //                   225 1981
    //                   226 1981
    //                   227 1981
    //                   228 1981
    //                   229 1981
    //                   230 1981
    //                   231 1981
    //                   232 1981
    //                   233 1981
    //                   234 1981
    //                   235 1981
    //                   236 1981
    //                   237 1981
    //                   238 1981
    //                   239 1981
    //                   240 1981
    //                   241 1981
    //                   242 1981
    //                   243 1981
    //                   244 1981
    //                   245 1981
    //                   246 1981
    //                   247 1972
    //                   248 1972
    //                   249 1981
    //                   250 1981
    //                   251 1981
    //                   252 1981
    //                   253 1981
    //                   254 1981
    //                   255 1981
    //                   256 1981
    //                   257 1981
    //                   258 1981
    //                   259 1981
    //                   260 1981
    //                   261 1981
    //                   262 1981
    //                   263 1981
    //                   264 1981
    //                   265 1981
    //                   266 1981
    //                   267 1981
    //                   268 1981
    //                   269 1981
    //                   270 1981
    //                   271 1981
    //                   272 1981
    //                   273 1981
    //                   274 1981
    //                   275 1981
    //                   276 1981
    //                   277 1981
    //                   278 1981
    //                   279 1981
    //                   280 1981
    //                   281 1981
    //                   282 1981
    //                   283 1981
    //                   284 1981
    //                   285 1981
    //                   286 1981
    //                   287 1981
    //                   288 1981
    //                   289 1981
    //                   290 1981
    //                   291 1981
    //                   292 1981
    //                   293 1981
    //                   294 1981
    //                   295 1981
    //                   296 1981
    //                   297 1981
    //                   298 1981
    //                   299 1981
    //                   300 1981
    //                   301 1981
    //                   302 1981
    //                   303 1981
    //                   304 1981
    //                   305 1981
    //                   306 1981
    //                   307 1981
    //                   308 1981
    //                   309 1981
    //                   310 1981
    //                   311 1981
    //                   312 1981
    //                   313 1981
    //                   314 1981
    //                   315 1981
    //                   316 1981
    //                   317 1981
    //                   318 1981
    //                   319 1981
    //                   320 1981
    //                   321 1981
    //                   322 1981
    //                   323 1981
    //                   324 1981
    //                   325 1981
    //                   326 1981
    //                   327 1981
    //                   328 1981
    //                   329 1981
    //                   330 1981
    //                   331 1981
    //                   332 1981
    //                   333 1972
    //                   334 1981
    //                   335 1981
    //                   336 1981
    //                   337 1981
    //                   338 1981
    //                   339 1981
    //                   340 1981
    //                   341 1972
    //                   342 1981
    //                   343 1981
    //                   344 1981
    //                   345 1972
    //                   346 1972
    //                   347 1972
    //                   348 1972
    //                   349 1981
    //                   350 1981
    //                   351 1981
    //                   352 1981
    //                   353 1981
    //                   354 1981
    //                   355 1981
    //                   356 1981
    //                   357 1981
    //                   358 1981
    //                   359 1981
    //                   360 1981
    //                   361 1981
    //                   362 1981
    //                   363 1981
    //                   364 1981
    //                   365 1981
    //                   366 1981
    //                   367 1981
    //                   368 1981
    //                   369 1981
    //                   370 1981
    //                   371 1981
    //                   372 1981
    //                   373 1981
    //                   374 1981
    //                   375 1981
    //                   376 1972
    //                   377 1981
    //                   378 1981
    //                   379 1981
    //                   380 1981
    //                   381 1972
    //                   382 1981
    //                   383 1981
    //                   384 1981
    //                   385 1981
    //                   386 1981
    //                   387 1981
    //                   388 1981
    //                   389 1981
    //                   390 1981
    //                   391 1981
    //                   392 1981
    //                   393 1981
    //                   394 1981
    //                   395 1981
    //                   396 1972
    //                   397 1981
    //                   398 1981
    //                   399 1981
    //                   400 1981
    //                   401 1981
    //                   402 1981
    //                   403 1981
    //                   404 1981
    //                   405 1981
    //                   406 1981
    //                   407 1981
    //                   408 1981
    //                   409 1981
    //                   410 1981
    //                   411 1981
    //                   412 1981
    //                   413 1981
    //                   414 1981
    //                   415 1981
    //                   416 1981
    //                   417 1981
    //                   418 1981
    //                   419 1981
    //                   420 1981
    //                   421 1981
    //                   422 1981
    //                   423 1981
    //                   424 1981
    //                   425 1981
    //                   426 1981
    //                   427 1981
    //                   428 1981
    //                   429 1981
    //                   430 1981
    //                   431 1981
    //                   432 1981
    //                   433 1981
    //                   434 1981
    //                   435 1981
    //                   436 1981
    //                   437 1981
    //                   438 1981
    //                   439 1981
    //                   440 1981
    //                   441 1981
    //                   442 1981
    //                   443 1981
    //                   444 1981
    //                   445 1981
    //                   446 1981
    //                   447 1981
    //                   448 1981
    //                   449 1981;
           goto _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L14 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L15 _L14 _L14 _L14 _L14 _L14 _L15 _L14 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L15 _L15 _L15 _L14 _L14 _L14 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L15 _L15 _L15 _L15 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15
_L14:
        k++;
          goto _L16
_L15:
        int l = j + 1;
        ai[j] = k1;
        j = l;
        if (true) goto _L14; else goto _L16
_L16:
        if (true) goto _L18; else goto _L17
_L17:
_L13:
        if (j != 0)
        {
            if (a == null)
            {
                k = 0;
            } else
            {
                k = a.length;
            }
            if (k == 0 && j == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[k + j];
                if (k != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, j);
                a = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1;
        i1 = kog1.c(kog1.p());
        j = kog1.r();
        k = 0;
_L24:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
            case 35: // '#'
            case 36: // '$'
            case 37: // '%'
            case 38: // '&'
            case 39: // '\''
            case 40: // '('
            case 41: // ')'
            case 42: // '*'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
            case 57: // '9'
            case 58: // ':'
            case 59: // ';'
            case 60: // '<'
            case 61: // '='
            case 62: // '>'
            case 63: // '?'
            case 64: // '@'
            case 65: // 'A'
            case 66: // 'B'
            case 67: // 'C'
            case 68: // 'D'
            case 69: // 'E'
            case 70: // 'F'
            case 71: // 'G'
            case 72: // 'H'
            case 73: // 'I'
            case 74: // 'J'
            case 75: // 'K'
            case 76: // 'L'
            case 77: // 'M'
            case 78: // 'N'
            case 79: // 'O'
            case 80: // 'P'
            case 81: // 'Q'
            case 82: // 'R'
            case 83: // 'S'
            case 84: // 'T'
            case 85: // 'U'
            case 86: // 'V'
            case 87: // 'W'
            case 88: // 'X'
            case 89: // 'Y'
            case 90: // 'Z'
            case 91: // '['
            case 92: // '\\'
            case 93: // ']'
            case 94: // '^'
            case 95: // '_'
            case 96: // '`'
            case 97: // 'a'
            case 98: // 'b'
            case 99: // 'c'
            case 100: // 'd'
            case 101: // 'e'
            case 102: // 'f'
            case 103: // 'g'
            case 104: // 'h'
            case 105: // 'i'
            case 106: // 'j'
            case 107: // 'k'
            case 108: // 'l'
            case 109: // 'm'
            case 110: // 'n'
            case 111: // 'o'
            case 112: // 'p'
            case 113: // 'q'
            case 114: // 'r'
            case 115: // 's'
            case 116: // 't'
            case 117: // 'u'
            case 118: // 'v'
            case 119: // 'w'
            case 120: // 'x'
            case 121: // 'y'
            case 122: // 'z'
            case 123: // '{'
            case 124: // '|'
            case 125: // '}'
            case 126: // '~'
            case 127: // '\177'
            case 128: 
            case 129: 
            case 130: 
            case 131: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 137: 
            case 138: 
            case 139: 
            case 140: 
            case 141: 
            case 142: 
            case 144: 
            case 145: 
            case 146: 
            case 147: 
            case 148: 
            case 149: 
            case 151: 
            case 157: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 167: 
            case 168: 
            case 170: 
            case 171: 
            case 172: 
            case 173: 
            case 174: 
            case 175: 
            case 177: 
            case 178: 
            case 179: 
            case 180: 
            case 181: 
            case 182: 
            case 183: 
            case 184: 
            case 185: 
            case 186: 
            case 187: 
            case 188: 
            case 189: 
            case 190: 
            case 191: 
            case 192: 
            case 193: 
            case 194: 
            case 195: 
            case 196: 
            case 197: 
            case 198: 
            case 199: 
            case 200: 
            case 201: 
            case 202: 
            case 203: 
            case 204: 
            case 205: 
            case 206: 
            case 207: 
            case 208: 
            case 209: 
            case 210: 
            case 211: 
            case 212: 
            case 213: 
            case 215: 
            case 216: 
            case 217: 
            case 218: 
            case 219: 
            case 220: 
            case 222: 
            case 223: 
            case 224: 
            case 225: 
            case 226: 
            case 227: 
            case 228: 
            case 229: 
            case 230: 
            case 231: 
            case 232: 
            case 233: 
            case 234: 
            case 235: 
            case 236: 
            case 237: 
            case 238: 
            case 239: 
            case 240: 
            case 241: 
            case 242: 
            case 243: 
            case 244: 
            case 245: 
            case 246: 
            case 249: 
            case 250: 
            case 251: 
            case 252: 
            case 253: 
            case 254: 
            case 255: 
            case 256: 
            case 257: 
            case 258: 
            case 259: 
            case 260: 
            case 261: 
            case 262: 
            case 263: 
            case 264: 
            case 265: 
            case 266: 
            case 267: 
            case 268: 
            case 269: 
            case 270: 
            case 271: 
            case 272: 
            case 273: 
            case 274: 
            case 275: 
            case 276: 
            case 277: 
            case 278: 
            case 279: 
            case 280: 
            case 281: 
            case 282: 
            case 283: 
            case 284: 
            case 285: 
            case 286: 
            case 287: 
            case 288: 
            case 289: 
            case 290: 
            case 291: 
            case 292: 
            case 293: 
            case 294: 
            case 295: 
            case 296: 
            case 297: 
            case 298: 
            case 299: 
            case 300: 
            case 301: 
            case 302: 
            case 303: 
            case 304: 
            case 305: 
            case 306: 
            case 307: 
            case 308: 
            case 309: 
            case 310: 
            case 311: 
            case 312: 
            case 313: 
            case 314: 
            case 315: 
            case 316: 
            case 317: 
            case 318: 
            case 319: 
            case 320: 
            case 321: 
            case 322: 
            case 323: 
            case 324: 
            case 325: 
            case 326: 
            case 327: 
            case 328: 
            case 329: 
            case 330: 
            case 331: 
            case 332: 
            case 334: 
            case 335: 
            case 336: 
            case 337: 
            case 338: 
            case 339: 
            case 340: 
            case 342: 
            case 343: 
            case 344: 
            case 349: 
            case 350: 
            case 351: 
            case 352: 
            case 353: 
            case 354: 
            case 355: 
            case 356: 
            case 357: 
            case 358: 
            case 359: 
            case 360: 
            case 361: 
            case 362: 
            case 363: 
            case 364: 
            case 365: 
            case 366: 
            case 367: 
            case 368: 
            case 369: 
            case 370: 
            case 371: 
            case 372: 
            case 373: 
            case 374: 
            case 375: 
            case 377: 
            case 378: 
            case 379: 
            case 380: 
            case 382: 
            case 383: 
            case 384: 
            case 385: 
            case 386: 
            case 387: 
            case 388: 
            case 389: 
            case 390: 
            case 391: 
            case 392: 
            case 393: 
            case 394: 
            case 395: 
            case 397: 
            case 398: 
            case 399: 
            case 400: 
            case 401: 
            case 402: 
            case 403: 
            case 404: 
            case 405: 
            case 406: 
            case 407: 
            case 408: 
            case 409: 
            case 410: 
            case 411: 
            case 412: 
            case 413: 
            case 414: 
            case 415: 
            case 416: 
            case 417: 
            case 418: 
            case 419: 
            case 420: 
            case 421: 
            case 422: 
            case 423: 
            case 424: 
            case 425: 
            case 426: 
            case 427: 
            case 428: 
            case 429: 
            case 430: 
            case 431: 
            case 432: 
            case 433: 
            case 434: 
            case 435: 
            case 436: 
            case 437: 
            case 438: 
            case 439: 
            case 440: 
            case 441: 
            case 442: 
            case 443: 
            case 444: 
            case 445: 
            case 446: 
            case 447: 
            case 448: 
            case 449: 
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L20; else goto _L19
_L19:
        kog1.e(j);
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        ai = new int[k + j];
        k = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, ai, 0, j);
            k = j;
        }
_L22:
        if (kog1.q() > 0)
        {
            j = kog1.f();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
            case 35: // '#'
            case 36: // '$'
            case 37: // '%'
            case 38: // '&'
            case 39: // '\''
            case 40: // '('
            case 41: // ')'
            case 42: // '*'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
            case 57: // '9'
            case 58: // ':'
            case 59: // ';'
            case 60: // '<'
            case 61: // '='
            case 62: // '>'
            case 63: // '?'
            case 64: // '@'
            case 65: // 'A'
            case 66: // 'B'
            case 67: // 'C'
            case 68: // 'D'
            case 69: // 'E'
            case 70: // 'F'
            case 71: // 'G'
            case 72: // 'H'
            case 73: // 'I'
            case 74: // 'J'
            case 75: // 'K'
            case 76: // 'L'
            case 77: // 'M'
            case 78: // 'N'
            case 79: // 'O'
            case 80: // 'P'
            case 81: // 'Q'
            case 82: // 'R'
            case 83: // 'S'
            case 84: // 'T'
            case 85: // 'U'
            case 86: // 'V'
            case 87: // 'W'
            case 88: // 'X'
            case 89: // 'Y'
            case 90: // 'Z'
            case 91: // '['
            case 92: // '\\'
            case 93: // ']'
            case 94: // '^'
            case 95: // '_'
            case 96: // '`'
            case 97: // 'a'
            case 98: // 'b'
            case 99: // 'c'
            case 100: // 'd'
            case 101: // 'e'
            case 102: // 'f'
            case 103: // 'g'
            case 104: // 'h'
            case 105: // 'i'
            case 106: // 'j'
            case 107: // 'k'
            case 108: // 'l'
            case 109: // 'm'
            case 110: // 'n'
            case 111: // 'o'
            case 112: // 'p'
            case 113: // 'q'
            case 114: // 'r'
            case 115: // 's'
            case 116: // 't'
            case 117: // 'u'
            case 118: // 'v'
            case 119: // 'w'
            case 120: // 'x'
            case 121: // 'y'
            case 122: // 'z'
            case 123: // '{'
            case 124: // '|'
            case 125: // '}'
            case 126: // '~'
            case 127: // '\177'
            case 128: 
            case 129: 
            case 130: 
            case 131: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 137: 
            case 138: 
            case 139: 
            case 140: 
            case 141: 
            case 142: 
            case 144: 
            case 145: 
            case 146: 
            case 147: 
            case 148: 
            case 149: 
            case 151: 
            case 157: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 167: 
            case 168: 
            case 170: 
            case 171: 
            case 172: 
            case 173: 
            case 174: 
            case 175: 
            case 177: 
            case 178: 
            case 179: 
            case 180: 
            case 181: 
            case 182: 
            case 183: 
            case 184: 
            case 185: 
            case 186: 
            case 187: 
            case 188: 
            case 189: 
            case 190: 
            case 191: 
            case 192: 
            case 193: 
            case 194: 
            case 195: 
            case 196: 
            case 197: 
            case 198: 
            case 199: 
            case 200: 
            case 201: 
            case 202: 
            case 203: 
            case 204: 
            case 205: 
            case 206: 
            case 207: 
            case 208: 
            case 209: 
            case 210: 
            case 211: 
            case 212: 
            case 213: 
            case 215: 
            case 216: 
            case 217: 
            case 218: 
            case 219: 
            case 220: 
            case 222: 
            case 223: 
            case 224: 
            case 225: 
            case 226: 
            case 227: 
            case 228: 
            case 229: 
            case 230: 
            case 231: 
            case 232: 
            case 233: 
            case 234: 
            case 235: 
            case 236: 
            case 237: 
            case 238: 
            case 239: 
            case 240: 
            case 241: 
            case 242: 
            case 243: 
            case 244: 
            case 245: 
            case 246: 
            case 249: 
            case 250: 
            case 251: 
            case 252: 
            case 253: 
            case 254: 
            case 255: 
            case 256: 
            case 257: 
            case 258: 
            case 259: 
            case 260: 
            case 261: 
            case 262: 
            case 263: 
            case 264: 
            case 265: 
            case 266: 
            case 267: 
            case 268: 
            case 269: 
            case 270: 
            case 271: 
            case 272: 
            case 273: 
            case 274: 
            case 275: 
            case 276: 
            case 277: 
            case 278: 
            case 279: 
            case 280: 
            case 281: 
            case 282: 
            case 283: 
            case 284: 
            case 285: 
            case 286: 
            case 287: 
            case 288: 
            case 289: 
            case 290: 
            case 291: 
            case 292: 
            case 293: 
            case 294: 
            case 295: 
            case 296: 
            case 297: 
            case 298: 
            case 299: 
            case 300: 
            case 301: 
            case 302: 
            case 303: 
            case 304: 
            case 305: 
            case 306: 
            case 307: 
            case 308: 
            case 309: 
            case 310: 
            case 311: 
            case 312: 
            case 313: 
            case 314: 
            case 315: 
            case 316: 
            case 317: 
            case 318: 
            case 319: 
            case 320: 
            case 321: 
            case 322: 
            case 323: 
            case 324: 
            case 325: 
            case 326: 
            case 327: 
            case 328: 
            case 329: 
            case 330: 
            case 331: 
            case 332: 
            case 334: 
            case 335: 
            case 336: 
            case 337: 
            case 338: 
            case 339: 
            case 340: 
            case 342: 
            case 343: 
            case 344: 
            case 349: 
            case 350: 
            case 351: 
            case 352: 
            case 353: 
            case 354: 
            case 355: 
            case 356: 
            case 357: 
            case 358: 
            case 359: 
            case 360: 
            case 361: 
            case 362: 
            case 363: 
            case 364: 
            case 365: 
            case 366: 
            case 367: 
            case 368: 
            case 369: 
            case 370: 
            case 371: 
            case 372: 
            case 373: 
            case 374: 
            case 375: 
            case 377: 
            case 378: 
            case 379: 
            case 380: 
            case 382: 
            case 383: 
            case 384: 
            case 385: 
            case 386: 
            case 387: 
            case 388: 
            case 389: 
            case 390: 
            case 391: 
            case 392: 
            case 393: 
            case 394: 
            case 395: 
            case 397: 
            case 398: 
            case 399: 
            case 400: 
            case 401: 
            case 402: 
            case 403: 
            case 404: 
            case 405: 
            case 406: 
            case 407: 
            case 408: 
            case 409: 
            case 410: 
            case 411: 
            case 412: 
            case 413: 
            case 414: 
            case 415: 
            case 416: 
            case 417: 
            case 418: 
            case 419: 
            case 420: 
            case 421: 
            case 422: 
            case 423: 
            case 424: 
            case 425: 
            case 426: 
            case 427: 
            case 428: 
            case 429: 
            case 430: 
            case 431: 
            case 432: 
            case 433: 
            case 434: 
            case 435: 
            case 436: 
            case 437: 
            case 438: 
            case 439: 
            case 440: 
            case 441: 
            case 442: 
            case 443: 
            case 444: 
            case 445: 
            case 446: 
            case 447: 
            case 448: 
            case 449: 
                ai[k] = j;
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
          goto _L20
        if (true) goto _L22; else goto _L21
_L21:
        if (true) goto _L24; else goto _L23
_L23:
_L20:
        kog1.d(i1);
        continue; /* Loop/switch isn't completed */
_L5:
        b = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        if (d == null)
        {
            d = new kpe();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L8:
        if (e == null)
        {
            e = new kpm();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L9:
        f = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        if (g == null)
        {
            g = new kpi();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L11:
        h = kog1.j();
        if (true) goto _L26; else goto _L25
_L25:
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int j = 0; j < a.length; j++)
            {
                koh1.a(1, a[j]);
            }

        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        super.writeTo(koh1);
    }
}
