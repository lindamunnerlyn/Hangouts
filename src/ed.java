// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

class ed
{

    ed()
    {
    }

    public Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, ga ga1)
    {
        if (ga1 != null)
        {
            ga1.a();
        }
        return contentresolver.query(uri, as, s, as1, s1);
    }
}
