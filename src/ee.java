// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

final class ee extends ed
{

    ee()
    {
    }

    public Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, ga ga1)
    {
        if (ga1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        ga1 = ((ga) (ga1.c()));
_L1:
        contentresolver = contentresolver.query(uri, as, s, as1, s1, (CancellationSignal)ga1);
        return contentresolver;
        ga1 = null;
          goto _L1
        contentresolver;
        if (contentresolver instanceof OperationCanceledException)
        {
            throw new gb();
        } else
        {
            throw contentresolver;
        }
    }
}
