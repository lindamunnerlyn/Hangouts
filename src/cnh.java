// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;

public class cnh extends eg
{

    private final ani w;

    public cnh(Context context, ani ani)
    {
        super(context);
        w = ani;
    }

    public cnh(Context context, ani ani, Uri uri, String as[], String s, String as1[], String s1)
    {
        super(context, uri, as, s, as1, s1);
        w = ani;
    }

    public ani C()
    {
        return w;
    }
}
