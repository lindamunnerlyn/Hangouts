// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class czi extends cyq
{

    private static final long serialVersionUID = 1L;
    public final List a;

    public czi(ixi ixi1)
    {
        a = new ArrayList(ixi1.a.length);
        ixi1 = ixi1.a;
        int j = ixi1.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = ixi1[i];
            a.add(new ebj(((ixh) (obj)).a, ((ixh) (obj)).b));
        }

    }
}
