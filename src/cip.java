// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.hangouts.permissions.impl.RationaleActivity;
import java.util.List;

public final class cip
    implements cib
{

    final RationaleActivity a;

    public cip(RationaleActivity rationaleactivity)
    {
        a = rationaleactivity;
        super();
    }

    public void a(List list, Bundle bundle)
    {
        a.setResult(-1, RationaleActivity.a(a));
        a.finish();
    }
}
