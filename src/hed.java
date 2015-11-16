// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hed
{

    int a;
    int b;
    String c;
    hed d;

    public hed(int i, int j)
    {
        this(i, j, null);
    }

    private hed(int i, int j, hed hed1)
    {
        StringBuilder stringbuilder;
        a = i;
        b = j;
        stringbuilder = new StringBuilder();
        stringbuilder.append('-');
        i;
        JVM INSTR tableswitch 3 8: default 72
    //                   3 115
    //                   4 72
    //                   5 72
    //                   6 126
    //                   7 137
    //                   8 148;
           goto _L1 _L2 _L1 _L1 _L3 _L4 _L5
_L1:
        j;
        JVM INSTR tableswitch 1 3: default 100
    //                   1 159
    //                   2 170
    //                   3 181;
           goto _L6 _L7 _L8 _L9
_L6:
        c = stringbuilder.toString();
        d = hed1;
        return;
_L2:
        stringbuilder.append('l');
          goto _L1
_L3:
        stringbuilder.append('A');
          goto _L1
_L4:
        stringbuilder.append('B');
          goto _L1
_L5:
        stringbuilder.append('C');
          goto _L1
_L7:
        stringbuilder.append('p');
          goto _L6
_L8:
        stringbuilder.append('s');
          goto _L6
_L9:
        stringbuilder.append('h');
          goto _L6
    }

    public hed a(hed hed1)
    {
        return new hed(a, b, hed1);
    }
}
