// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import com.google.android.apps.hangouts.conversation.v2.gallerypicker.impl.GalleryItemView;

final class bbr
    implements Runnable
{

    final Cursor a;
    final GalleryItemView b;
    final bbq c;

    bbr(bbq bbq1, Cursor cursor, GalleryItemView galleryitemview)
    {
        c = bbq1;
        a = cursor;
        b = galleryitemview;
        super();
    }

    public void run()
    {
        bbq bbq1 = c;
        Cursor cursor = a;
        GalleryItemView galleryitemview = b;
        if (!cursor.isClosed())
        {
            int j = cursor.getPosition();
            for (int i = j - 5; i < j + 5; i++)
            {
                if (i >= 0 && i < bbq1.getCount() && i != j)
                {
                    cursor.moveToPosition(i);
                    bbo bbo1 = bbq1.b.a(cursor);
                    bbq1.b.a(bbo1.a, null, galleryitemview.c());
                }
            }

            cursor.moveToPosition(j);
        }
    }
}
