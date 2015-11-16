// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gs
    implements gt
{

    public static final gs a = new gs();

    private gs()
    {
    }

    public int a(CharSequence charsequence, int i, int j)
    {
        int l = 2;
        for (int k = i; k < i + j && l == 2; k++)
        {
            l = gq.a(Character.getDirectionality(charsequence.charAt(k)));
        }

        return l;
    }

}
