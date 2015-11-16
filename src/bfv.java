// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

public final class bfv
    implements cjh
{

    final com.google.android.apps.hangouts.fragments.BabelPhotoViewFragment.StoragePermissionHelperActivity a;

    public bfv(com.google.android.apps.hangouts.fragments.BabelPhotoViewFragment.StoragePermissionHelperActivity storagepermissionhelperactivity)
    {
        a = storagepermissionhelperactivity;
        super();
    }

    public void a(List list, Bundle bundle)
    {
        gdv.a(Integer.valueOf(list.size()), Integer.valueOf(1));
        list = (cji)list.get(0);
        gdv.a(((cji) (list)).a, "android.permission.WRITE_EXTERNAL_STORAGE");
        bundle = a;
        byte byte0;
        if (((cji) (list)).b)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        bundle.setResult(byte0);
        a.finish();
    }
}
