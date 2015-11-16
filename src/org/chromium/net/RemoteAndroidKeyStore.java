// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.RemoteException;

// Referenced classes of package org.chromium.net:
//            AndroidKeyStore, IRemoteAndroidKeyStore, AndroidPrivateKey

public class RemoteAndroidKeyStore
    implements AndroidKeyStore
{

    private final IRemoteAndroidKeyStore a;

    public byte[] getECKeyOrder(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        try
        {
            androidprivatekey = a.d(androidprivatekey.a());
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
            return null;
        }
        return androidprivatekey;
    }

    public Object getOpenSSLEngineForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        return null;
    }

    public long getOpenSSLHandleForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        return 0L;
    }

    public int getPrivateKeyType(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        int i;
        try
        {
            i = a.e(androidprivatekey.a());
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
            return 0;
        }
        return i;
    }

    public byte[] getRSAKeyModulus(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        try
        {
            androidprivatekey = a.a(androidprivatekey.a());
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
            return null;
        }
        return androidprivatekey;
    }

    public byte[] rawSignDigestWithPrivateKey(AndroidPrivateKey androidprivatekey, byte abyte0[])
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        try
        {
            androidprivatekey = a.a(androidprivatekey.a(), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
            return null;
        }
        return androidprivatekey;
    }

    public void releaseKey(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        try
        {
            a.f(androidprivatekey.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
        }
    }

    private class RemotePrivateKey
        implements AndroidPrivateKey
    {

        final int a;
        final RemoteAndroidKeyStore b;

        public int a()
        {
            return a;
        }

        public AndroidKeyStore getKeyStore()
        {
            return b;
        }
    }

}
