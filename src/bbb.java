// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import com.google.android.apps.hangouts.conversation.v2.gallerypicker.impl.GalleryItemView;

final class bbb
    implements Runnable
{

    final Cursor a;
    final GalleryItemView b;
    final bba c;

    bbb(bba bba1, Cursor cursor, GalleryItemView galleryitemview)
    {
        c = bba1;
        a = cursor;
        b = galleryitemview;
        super();
    }

    public void run()
    {
        bba.a(c, a, b);
    }
}
