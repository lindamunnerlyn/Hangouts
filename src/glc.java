// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class glc extends gkx
{

    glc(String s)
    {
        super(s, 3);
    }

    boolean a(glq glq, String s, gkv gkv1)
    {
        if (!gkv1.b(glq) || !gks.a(glq, s, gkv1) || gks.a(glq, s) || !gks.a(glq, gkv1))
        {
            return false;
        } else
        {
            return gks.a(glq, s, gkv1, new gld(this));
        }
    }
}
