// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gaz
    implements gbf
{

    gaz()
    {
    }

    public String a(kop kop)
    {
        Object obj = (jcp)kop;
        kop = String.valueOf(((jcp) (obj)).b);
        obj = String.valueOf(((jcp) (obj)).c);
        if (((String) (obj)).length() != 0)
        {
            return kop.concat(((String) (obj)));
        } else
        {
            return new String(kop);
        }
    }
}
