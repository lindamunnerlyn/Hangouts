// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gdn
    implements gdt
{

    gdn()
    {
    }

    public String a(kws kws)
    {
        Object obj = (jiz)kws;
        kws = String.valueOf(((jiz) (obj)).b);
        obj = String.valueOf(((jiz) (obj)).c);
        if (((String) (obj)).length() != 0)
        {
            return kws.concat(((String) (obj)));
        } else
        {
            return new String(kws);
        }
    }
}
