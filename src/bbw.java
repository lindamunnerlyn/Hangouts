// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.conversation.v2.gallerypicker.impl.GalleryItemView;

public final class bbw
    implements Runnable
{

    final String a;
    final GalleryItemView b;

    public bbw(GalleryItemView galleryitemview, String s)
    {
        b = galleryitemview;
        a = s;
        super();
    }

    public void run()
    {
        b.a.a(a, b, b.c());
    }
}
