// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

final class bdm extends AsyncTask
{

    final bdj a;
    private final Uri b;

    public bdm(bdj bdj1, Uri uri)
    {
        a = bdj1;
        super();
        b = uri;
    }

    protected Object doInBackground(Object aobj[])
    {
        a.b.getContentResolver().delete(b, null, null);
        return null;
    }
}
