// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class dlw extends Binder
{

    final RequestWriter a;

    public dlw(RequestWriter requestwriter)
    {
        a = requestwriter;
        super();
    }

    public dls a()
    {
        return a;
    }
}
