// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;
import com.android.ex.photo.PhotoViewPager;

final class clg
    implements Runnable
{

    final clf a;

    clg(clf clf1)
    {
        a = clf1;
        super();
    }

    public void run()
    {
        a.j.setVisibility(8);
        a.i.setVisibility(0);
    }
}
