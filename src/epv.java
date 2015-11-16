// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ValidateAccountRequest;

public final class epv
    implements android.os.Parcelable.Creator
{

    public epv()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = g.a(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    i = g.e(parcel, l);
                    break;

                case 3: // '\003'
                    ibinder = g.j(parcel, l);
                    break;

                case 4: // '\004'
                    ascope = (Scope[])g.b(parcel, l, Scope.CREATOR);
                    break;

                case 5: // '\005'
                    bundle = g.k(parcel, l);
                    break;

                case 6: // '\006'
                    s = g.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ValidateAccountRequest(j, i, ibinder, ascope, bundle, s);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new ValidateAccountRequest[i];
    }
}
