// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gr
    implements gt
{

    public static final gr a = new gr(true);
    public static final gr b = new gr(false);
    private final boolean c;

    private gr(boolean flag)
    {
        c = flag;
    }

    public int a(CharSequence charsequence, int i, int j)
    {
        int k;
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = false;
        k = i;
_L6:
        int l = k;
        if (l >= i + j) goto _L2; else goto _L1
_L1:
        gq.b(Character.getDirectionality(charsequence.charAt(l)));
        JVM INSTR tableswitch 0 1: default 56
    //                   0 77
    //                   1 96;
           goto _L3 _L4 _L5
_L3:
        k = ((flag) ? 1 : 0);
_L9:
        l++;
        flag = k;
        k = l;
          goto _L6
_L4:
        if (!c) goto _L8; else goto _L7
_L7:
        k = 0;
_L11:
        return k;
_L8:
        k = 1;
          goto _L9
_L5:
        k = ((flag1) ? 1 : 0);
        if (!c) goto _L11; else goto _L10
_L10:
        k = 1;
          goto _L9
_L2:
        if (!flag) goto _L13; else goto _L12
_L12:
        k = ((flag1) ? 1 : 0);
        if (!c)
        {
            return 0;
        }
          goto _L11
_L13:
        return 2;
          goto _L9
    }

}
