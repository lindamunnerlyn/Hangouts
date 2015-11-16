// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

final class edm extends BitmapDrawable
{

    final edj a;
    private final WeakReference b;

    public edm(edj edj, Resources resources, edn edn1)
    {
        a = edj;
        super(resources, null);
        b = new WeakReference(edn1);
    }

    public edn a()
    {
        return (edn)b.get();
    }
}
