package org.jetbrains.plugins.scala.lang.formatting.settings;

import com.intellij.application.options.CodeStyleAbstractPanel;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

/**
 * @author Pavel Fatin
 */
abstract class TypeAnnotationsPanelBase extends CodeStyleAbstractPanel {
  protected JCheckBox myPublicMember;
  protected JCheckBox myProtectedMember;
  protected JCheckBox myPrivateMember;
  protected JCheckBox myFunctionParameter;
  protected JCheckBox myUnderscoerParameter;
  protected JCheckBox myLocalDefinition;
  protected JCheckBox myImplicitModifier;
  protected JCheckBox myConstant;
  protected JCheckBox myMemberOfAnonymousClass;
  protected JCheckBox myMemberOfPrivateClass;
  protected JCheckBox myScript;
  protected JCheckBox myTestSources;
  protected JCheckBox myUnitType;
  protected JList<String> myMembers;
  protected JList<String> myAnnotations;
  protected JList<String> myTypes;
  protected JPanel myTypesPanel;
  protected JPanel myMembersPanel;
  protected JPanel myAnnotationsPanel;
  protected JPanel myContent;
  protected JCheckBox myObviousType;

  protected TypeAnnotationsPanelBase(@NotNull CodeStyleSettings settings) {
    super(settings);
  }

  /**
   * @noinspection ALL
   */
  private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
    if (currentFont == null) return null;
    String resultName;
    if (fontName == null) {
      resultName = currentFont.getName();
    } else {
      Font testFont = new Font(fontName, Font.PLAIN, 10);
      if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
        resultName = fontName;
      } else {
        resultName = currentFont.getName();
      }
    }
    return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
  }

  {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
    $$$setupUI$$$();
  }

  /**
   * Method generated by IntelliJ IDEA GUI Designer
   * >>> IMPORTANT!! <<<
   * DO NOT edit this method OR call it in your code!
   *
   * @noinspection ALL
   */
  private void $$$setupUI$$$() {
    myContent = new JPanel();
    myContent.setLayout(new GridLayoutManager(2, 3, new Insets(0, 0, 0, 0), 0, -1));
    final JPanel panel1 = new JPanel();
    panel1.setLayout(new GridLayoutManager(10, 1, new Insets(0, 0, 0, 0), -1, -1));
    myContent.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
    panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(10, 10, 0, 0), null));
    myPublicMember = new JCheckBox();
    myPublicMember.setSelected(true);
    myPublicMember.setText("Public member");
    panel1.add(myPublicMember, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myProtectedMember = new JCheckBox();
    myProtectedMember.setSelected(true);
    myProtectedMember.setText("Protected member");
    panel1.add(myProtectedMember, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myLocalDefinition = new JCheckBox();
    myLocalDefinition.setText("Local definition");
    panel1.add(myLocalDefinition, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myFunctionParameter = new JCheckBox();
    myFunctionParameter.setText("Function parameter");
    panel1.add(myFunctionParameter, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myUnderscoerParameter = new JCheckBox();
    myUnderscoerParameter.setText("Underscore parameter");
    panel1.add(myUnderscoerParameter, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myPrivateMember = new JCheckBox();
    myPrivateMember.setText("Private member");
    panel1.add(myPrivateMember, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myImplicitModifier = new JCheckBox();
    myImplicitModifier.setSelected(true);
    myImplicitModifier.setText("With \"implicit\" modifier");
    panel1.add(myImplicitModifier, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myUnitType = new JCheckBox();
    myUnitType.setSelected(true);
    myUnitType.setText("When type is \"Unit\"");
    panel1.add(myUnitType, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    final JLabel label1 = new JLabel();
    Font label1Font = this.$$$getFont$$$(null, Font.BOLD, -1, label1.getFont());
    if (label1Font != null) label1.setFont(label1Font);
    label1.setText("Add");
    panel1.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    final Spacer spacer1 = new Spacer();
    panel1.add(spacer1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 2), null, null, 0, false));
    final JPanel panel2 = new JPanel();
    panel2.setLayout(new GridLayoutManager(10, 6, new Insets(0, 0, 0, 0), 0, -1));
    myContent.add(panel2, new GridConstraints(0, 1, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
    panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0), null));
    myConstant = new JCheckBox();
    myConstant.setSelected(true);
    myConstant.setText("Constant (final val)");
    panel2.add(myConstant, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    final Spacer spacer2 = new Spacer();
    panel2.add(spacer2, new GridConstraints(9, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    final JSeparator separator1 = new JSeparator();
    separator1.setOrientation(1);
    panel2.add(separator1, new GridConstraints(0, 1, 9, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    final JPanel panel3 = new JPanel();
    panel3.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    panel2.add(panel3, new GridConstraints(8, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
    panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0), null));
    final Spacer spacer3 = new Spacer();
    panel3.add(spacer3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 5), null, null, 0, false));
    myMemberOfAnonymousClass = new JCheckBox();
    myMemberOfAnonymousClass.setText("Member of anonymous class");
    panel2.add(myMemberOfAnonymousClass, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myMemberOfPrivateClass = new JCheckBox();
    myMemberOfPrivateClass.setText("Member of private class");
    panel2.add(myMemberOfPrivateClass, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myObviousType = new JCheckBox();
    myObviousType.setSelected(true);
    myObviousType.setText("When type is obvious");
    panel2.add(myObviousType, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    final JPanel panel4 = new JPanel();
    panel4.setLayout(new GridLayoutManager(9, 1, new Insets(0, 0, 0, 0), -1, -1));
    panel2.add(panel4, new GridConstraints(2, 5, 7, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
    final Spacer spacer4 = new Spacer();
    panel4.add(spacer4, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 5), null, null, 0, false));
    final Spacer spacer5 = new Spacer();
    panel4.add(spacer5, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 5), null, null, 0, false));
    final JLabel label2 = new JLabel();
    label2.setText("When type matches:");
    panel4.add(label2, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    final JLabel label3 = new JLabel();
    label3.setText("When annotated with:");
    panel4.add(label3, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myMembersPanel = new JPanel();
    myMembersPanel.setLayout(new BorderLayout(0, 0));
    panel4.add(myMembersPanel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(0, -1), new Dimension(200, -1), null, 0, false));
    myMembers = new JList();
    myMembers.setVisibleRowCount(4);
    myMembersPanel.add(myMembers, BorderLayout.CENTER);
    myAnnotationsPanel = new JPanel();
    myAnnotationsPanel.setLayout(new BorderLayout(0, 0));
    panel4.add(myAnnotationsPanel, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(0, -1), new Dimension(200, -1), null, 0, false));
    myAnnotations = new JList();
    myAnnotations.setVisibleRowCount(4);
    myAnnotationsPanel.add(myAnnotations, BorderLayout.CENTER);
    myTypesPanel = new JPanel();
    myTypesPanel.setLayout(new BorderLayout(0, 0));
    panel4.add(myTypesPanel, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(0, -1), new Dimension(200, -1), null, 0, false));
    myTypes = new JList();
    final DefaultListModel defaultListModel1 = new DefaultListModel();
    myTypes.setModel(defaultListModel1);
    myTypes.setVisibleRowCount(4);
    myTypesPanel.add(myTypes, BorderLayout.CENTER);
    final JLabel label4 = new JLabel();
    label4.setText("Member of:");
    panel4.add(label4, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    final Spacer spacer6 = new Spacer();
    panel4.add(spacer6, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 5), null, null, 0, false));
    final Spacer spacer7 = new Spacer();
    panel2.add(spacer7, new GridConstraints(2, 4, 7, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, 1, new Dimension(10, -1), null, null, 0, false));
    final JLabel label5 = new JLabel();
    Font label5Font = this.$$$getFont$$$(null, Font.BOLD, -1, label5.getFont());
    if (label5Font != null) label5.setFont(label5Font);
    label5.setText("Omit");
    panel2.add(label5, new GridConstraints(0, 3, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    final Spacer spacer8 = new Spacer();
    panel2.add(spacer8, new GridConstraints(9, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    final Spacer spacer9 = new Spacer();
    panel2.add(spacer9, new GridConstraints(1, 3, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 2), null, null, 0, false));
    final Spacer spacer10 = new Spacer();
    panel2.add(spacer10, new GridConstraints(0, 2, 9, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, 1, new Dimension(12, -1), null, null, 0, false));
    final Spacer spacer11 = new Spacer();
    panel2.add(spacer11, new GridConstraints(0, 0, 9, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, 1, new Dimension(12, -1), null, null, 0, false));
    myTestSources = new JCheckBox();
    myTestSources.setText("In test sources");
    panel2.add(myTestSources, new GridConstraints(6, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    myScript = new JCheckBox();
    myScript.setText("In script");
    panel2.add(myScript, new GridConstraints(7, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    final Spacer spacer12 = new Spacer();
    myContent.add(spacer12, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    final Spacer spacer13 = new Spacer();
    myContent.add(spacer13, new GridConstraints(0, 2, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return myContent;
  }
}