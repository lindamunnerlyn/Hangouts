// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.widget.ContentLoadingProgressBar;

public final class ny
    implements Runnable
{

    final ContentLoadingProgressBar a;

    public ny(ContentLoadingProgressBar contentloadingprogressbar)
    {
        a = contentloadingprogressbar;
        super();
    }

    public void run()
    {
        a.b = false;
        a.a = -1L;
        a.setVisibility(8);
    }
}
