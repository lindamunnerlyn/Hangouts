// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

final class eai extends BitmapDrawable
{

    final eaf a;
    private final WeakReference b;

    public eai(eaf eaf, Resources resources, eaj eaj1)
    {
        a = eaf;
        super(resources, null);
        b = new WeakReference(eaj1);
    }

    public eaj a()
    {
        return (eaj)b.get();
    }
}
