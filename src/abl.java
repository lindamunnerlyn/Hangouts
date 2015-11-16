// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public final class abl extends eg
{

    private final Uri w;
    private final String x[];

    public abl(Context context, Uri uri, String as[])
    {
        super(context);
        w = uri;
        if (as == null)
        {
            as = abm.a;
        }
        x = as;
    }

    public Object d()
    {
        return h();
    }

    public Cursor h()
    {
        a(w.buildUpon().appendQueryParameter("contentType", "image/").build());
        a(x);
        return super.h();
    }
}
