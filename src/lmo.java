// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.PrivateKey;
import org.chromium.net.AndroidKeyStore;
import org.chromium.net.AndroidPrivateKey;
import org.chromium.net.DefaultAndroidKeyStore;

public final class lmo
    implements AndroidPrivateKey
{

    final PrivateKey a;
    final DefaultAndroidKeyStore b;

    public PrivateKey a()
    {
        return a;
    }

    public AndroidKeyStore getKeyStore()
    {
        return b;
    }
}
