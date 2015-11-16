// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.wearable.internal.AddListenerRequest;

public final class fxr
    implements android.os.Parcelable.Creator
{

    public fxr()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = g.a(parcel);
        int i = 0;
        String s1 = null;
        IntentFilter aintentfilter[] = null;
        android.os.IBinder ibinder = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = g.j(parcel, k);
                    break;

                case 3: // '\003'
                    aintentfilter = (IntentFilter[])g.b(parcel, k, IntentFilter.CREATOR);
                    break;

                case 4: // '\004'
                    s1 = g.i(parcel, k);
                    break;

                case 5: // '\005'
                    s = g.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AddListenerRequest(i, ibinder, aintentfilter, s1, s);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new AddListenerRequest[i];
    }
}
