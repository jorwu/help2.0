package home;

import java.util.ArrayList;

import jeese.helpme.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.haarman.listviewanimations.ArrayAdapter;

public class Home_ListView_Adapter extends ArrayAdapter<Integer> {

	private Context mContext;

	public Home_ListView_Adapter(Context context, ArrayList<Integer> items) {
		super(items);
		mContext = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		View view = convertView;
		if (view == null) {
			view = LayoutInflater.from(mContext).inflate(
					R.layout.home_fragment_listview_item, parent, false);

			viewHolder = new ViewHolder();
			viewHolder.textView = (TextView) view
					.findViewById(R.id.home_fragment_listview_item_textview);
			view.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) view.getTag();
		}

		viewHolder.textView.setText("��֪�����������������ӵĶ������Ǿ������Լ����Ը�Ҳ�������Լ�˼������ɡ�������������Ҷ����µ�ǹ�ˡ���Ҳ����˵��������ĸ����Ӱ�졣��Ϊʲô��Ҫ�ƽ���һ�������ĵĹ�ʧ������˺��أ���ˡ�ɣ�ԭ�°ɣ����Ǵ��ĵ��ˣ�����Ҽƽϡ�" + (getItem(position) + 1));

		return view;
	}

	@Override
	public long getItemId(int position) {
		return getItem(position).hashCode();
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}

	private static class ViewHolder {
		TextView textView;
	}

}
