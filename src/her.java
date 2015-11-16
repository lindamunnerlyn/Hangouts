// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class her
{

    public her()
    {
    }

    static int a(hfr hfr1)
    {
        switch (hes.a[hfr1.ordinal()])
        {
        default:
            hfr1 = String.valueOf(hfr1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(hfr1).length() + 24)).append("unknown storage policy: ").append(hfr1).toString());

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;
        }
    }
}
