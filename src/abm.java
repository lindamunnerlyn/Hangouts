// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

class abm
    implements abp
{

    public final ContentResolver a;
    public final Uri b;

    public abm(ContentResolver contentresolver, Uri uri)
    {
        a = contentresolver;
        b = uri;
    }

    public InputStream a()
    {
        return a.openInputStream(b);
    }
}
