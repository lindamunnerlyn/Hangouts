// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

class abo
    implements abr
{

    public final ContentResolver a;
    public final Uri b;

    public abo(ContentResolver contentresolver, Uri uri)
    {
        a = contentresolver;
        b = uri;
    }

    public InputStream a()
    {
        return a.openInputStream(b);
    }
}
