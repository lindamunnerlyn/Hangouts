// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gla extends gkx
{

    gla(String s)
    {
        super(s, 2);
    }

    boolean a(glq glq, String s, gkv gkv1)
    {
        if (!gkv1.b(glq) || !gks.a(glq, s, gkv1) || gks.a(glq, s) || !gks.a(glq, gkv1))
        {
            return false;
        } else
        {
            return gks.a(glq, s, gkv1, new glb(this));
        }
    }
}
