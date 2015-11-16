// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.Binder;
import android.os.Parcel;

// Referenced classes of package org.chromium.net:
//            IRemoteAndroidKeyStoreCallbacks

public abstract class attachInterface extends Binder
    implements IRemoteAndroidKeyStoreCallbacks
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
            b();
            parcel1.writeNoException();
            return true;
        }
    }

    public ()
    {
        attachInterface(this, "org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
    }
}
